/**
 * Copyright 2013 European Parliament
 *
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 */
package org.nsesa.editor.gwt.an.amendments.client;

import org.nsesa.editor.gwt.core.client.ui.overlay.DefaultFormatter;
import org.nsesa.editor.gwt.core.client.ui.overlay.Formatter;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.validation.OverlayWidgetValidator;
import org.nsesa.editor.gwt.core.client.validation.ValidationResult;
import org.nsesa.editor.gwt.core.client.validation.Validator;
import org.nsesa.editor.gwt.core.client.validation.WellformedValidator;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple "composite" validator to allow registration of several validators.
 *
 * @author <a href="mailto:stelian.groza@gmail.com">Stelian Groza</a>
 *         Date: 21/03/13 12:31
 */
public class AmendmentOverlayWidgetValidator implements Validator<OverlayWidget> {

    private List<Validator<OverlayWidget>> validators;

    public AmendmentOverlayWidgetValidator() {
        this.validators = new ArrayList<Validator<OverlayWidget>>();
        addValidator(new OverlayWidgetValidator());
        addValidator(new Validator<OverlayWidget>() {
            private WellformedValidator wrapped = new WellformedValidator();
            private Formatter formatter = new DefaultFormatter();

            @Override
            public ValidationResult validate(OverlayWidget toValidate) {
                return wrapped.validate(formatter.format(toValidate));
            }
        });
    }

    /**
     * Validate {@link OverlayWidget} against each validator presented in the <code>validators</code> list.
     * It is a short circuit evaluation meaning the algorithm stop when validation fails on one of the validators.
     *
     * @param toValidate the instance to validate
     * @return The last validation result
     */
    @Override
    public ValidationResult validate(OverlayWidget toValidate) {
        ValidationResult validationResult = null;
        for (Validator<OverlayWidget> validator : validators) {
            validationResult = validator.validate(toValidate);
            if (!validationResult.isSuccessful()) {
                break;
            }
        }
        return validationResult;
    }

    private void addValidator(Validator<OverlayWidget> validator) {
        this.validators.add(validator);
    }
}
