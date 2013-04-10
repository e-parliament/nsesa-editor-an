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
package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen;

import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Container;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Judgement;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Ul;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Ol;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Parliamentary;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.AkomaNtoso;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Amendment;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.QuorumVerification;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Voting;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Recount;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.FRBRalias;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.FRBRthis;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.FRBRname;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.FRBRuri;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.FRBRsubtype;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.FRBRcountry;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.FRBRformat;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.FRBRnumber;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.FRBRlanguage;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.TimeInterval;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.FRBRdate;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.FRBRauthor;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Keyword;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Publication;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.FRBRtranslation;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Header;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Content;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Intro;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.AmendmentJustification;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Td;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Th;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.AmendmentReference;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.AmendmentContent;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.LongTitle;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Wrap;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.AmendmentHeading;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Other;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Formula;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Bill;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Act;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.JudgementBody;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Rref;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Ref;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Eol;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Eop;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.NoteRef;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Br;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Img;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.AmendmentBody;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Preamble;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Judicial;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Mod;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Mmod;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Rmod;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Efficacy;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Force;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Application;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Duration;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.References;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.CollectionBody;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Preface;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Quorum;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Count;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Debate;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.TextualMod;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.ScopeMod;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.LegalSystemMod;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.MeaningMod;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.EfficacyMod;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.ForceMod;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Supports;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Contrasts;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Restricts;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.PutsInQuestion;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Applies;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Distinguishes;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.IsAnalogTo;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.DissentsFrom;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Overrules;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Derogates;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Extends;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.CoverPage;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Conclusions;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.ComponentRef;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Body;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.FRBRExpression;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.FRBRItem;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.FRBRManifestation;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.FRBRWork;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.ActiveModifications;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.PassiveModifications;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.TLCEvent;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.TLCLocation;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.PassiveRef;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.ActiveRef;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Original;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.TLCConcept;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Jurisprudence;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.AttachmentOf;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.TLCObject;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.TLCPerson;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.TLCReference;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.TLCRole;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.TLCProcess;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.HasAttachment;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.TLCOrganization;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.TLCTerm;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.FragmentBody;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Summary;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.FillIn;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Signature;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Vote;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.ListIntroduction;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.DocPurpose;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Date;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.QuotedText;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Inline;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.RelatedDocument;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.DocIntroducer;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.B;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.A;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.I;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Num;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.U;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.P;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.DocType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Change;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Opinion;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.DocStage;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.DocCommittee;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.DocNumber;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.ExtractText;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Span;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Sub;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Sup;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.DocketNumber;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Mref;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.NeutralCitation;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.DocStatus;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Legislature;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.TocItem;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Session;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.RecordedTime;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Scene;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Heading;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Block;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.DocJurisdiction;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.DocProponent;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Omissis;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Def;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.DocTitle;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Del;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.AffectedDocument;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Placeholder;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Caption;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Outcome;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.ShortTitle;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Remark;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Narrative;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.ListConclusion;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Ins;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Subheading;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.CourtType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.From;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.DocDate;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Introduction;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Background;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.MainBody;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Motivation;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Decision;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Answer;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Speech;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Question;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Tome;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Division;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Part;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Subchapter;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Subdivision;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Subsection;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Transitional;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Chapter;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Clause;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Paragraph;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Subclause;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Sublist;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Subparagraph;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Title;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Point;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Article;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Hcontainer;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Alinea;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Indent;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.List;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Section;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Subpart;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Subtitle;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Book;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Citation;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Item;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Tblock;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Recital;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.AdministrationOfOath;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Papers;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.ProceduralMotions;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.NationalInterest;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.NoticesOfMotion;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Adjournment;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Communication;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.OralStatements;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Questions;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.DebateSection;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.PersonalStatements;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.PointOfOrder;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.DeclarationOfVote;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Petitions;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Resolutions;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.RollCall;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Address;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.WrittenStatements;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Prayers;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.MinisterialStatements;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Domain;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.New;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Condition;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.OtherAnalysis;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Foreign;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Result;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.EventRef;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Proprietary;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Old;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Presentation;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Step;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Preservation;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.DebateBody;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Party;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Event;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Role;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Quantity;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Entity;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Organization;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Person;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Judge;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Process;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Location;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Lawyer;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Concept;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Object;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Term;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Note;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Div;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Interstitial;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Fragment;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.QuotedStructure;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.ExtractStructure;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Popup;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.AuthorialNote;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Source;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Destination;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Doc;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.DebateReport;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Marker;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.AmendmentList;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.DocumentCollection;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.OfficialGazette;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Components;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Meta;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.TemporalData;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Notes;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Tr;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Component;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Workflow;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Toc;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Analysis;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Citations;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Recitals;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Lifecycle;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Table;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.ComponentData;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Classification;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.BlockList;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.TemporalGroup;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Li;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.ComponentInfo;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Attachments;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Identification;
import com.google.inject.Inject;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.DefaultOverlayFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayStrategy;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import com.google.gwt.dom.client.Element;
import java.util.logging.Logger;
import java.util.Map;
/**
* A factory class specialization used to create overlay wigets based on the given DOM element input data
* Note: this file is generated. Rather than changing this file, correct the template called <tt>overlayFactory.ftl</tt>.
*/
public class Akomantoso20OverlayFactory extends DefaultOverlayFactory  {

private final static Logger LOG = Logger.getLogger(Akomantoso20OverlayFactory.class.getName());
/** the namespace URI of the overlay factory **/
private final String namespaceURI = "http://www.akomantoso.org/2.0";

/**
* Create <code>Akomantoso20OverlayFactory</code> object with the given overlay strategy
* @param overlayStrategy The strategy to be used to create overlay widget objects
*/
@Inject
public Akomantoso20OverlayFactory(final OverlayStrategy overlayStrategy) {
super(overlayStrategy);
}
/**
* Return <code>namespaceURI</code> of the overlay class
* @return the namespace URI as String
*/
@Override
public String getNamespaceURI() {
return namespaceURI;
}
/**
* Return <code>OverlayWidget</code> instance based on the given DOM element or null if there is no
* possibility to create an overlay widget with the type specified in the DOM element "type" attribute
* @return an overlay widget instance
*/
@Override
public OverlayWidget toAmendableWidget(final Element element) {
final String nodeName = overlayStrategy.getType(element);
final String namespaceURI = overlayStrategy.getNamespaceURI(element);

if ("".equals(nodeName)) {
throw new IllegalArgumentException("Empty element or null passed.");
}
else if ("container".equalsIgnoreCase(nodeName)) {
return new Container(element);
}
else if ("judgement".equalsIgnoreCase(nodeName)) {
return new Judgement(element);
}
else if ("ul".equalsIgnoreCase(nodeName)) {
return new Ul(element);
}
else if ("ol".equalsIgnoreCase(nodeName)) {
return new Ol(element);
}
else if ("parliamentary".equalsIgnoreCase(nodeName)) {
return new Parliamentary(element);
}
else if ("akomaNtoso".equalsIgnoreCase(nodeName)) {
return new AkomaNtoso(element);
}
else if ("amendment".equalsIgnoreCase(nodeName)) {
return new Amendment(element);
}
else if ("quorumVerification".equalsIgnoreCase(nodeName)) {
return new QuorumVerification(element);
}
else if ("voting".equalsIgnoreCase(nodeName)) {
return new Voting(element);
}
else if ("recount".equalsIgnoreCase(nodeName)) {
return new Recount(element);
}
else if ("FRBRalias".equalsIgnoreCase(nodeName)) {
return new FRBRalias(element);
}
else if ("FRBRthis".equalsIgnoreCase(nodeName)) {
return new FRBRthis(element);
}
else if ("FRBRname".equalsIgnoreCase(nodeName)) {
return new FRBRname(element);
}
else if ("FRBRuri".equalsIgnoreCase(nodeName)) {
return new FRBRuri(element);
}
else if ("FRBRsubtype".equalsIgnoreCase(nodeName)) {
return new FRBRsubtype(element);
}
else if ("FRBRcountry".equalsIgnoreCase(nodeName)) {
return new FRBRcountry(element);
}
else if ("FRBRformat".equalsIgnoreCase(nodeName)) {
return new FRBRformat(element);
}
else if ("FRBRnumber".equalsIgnoreCase(nodeName)) {
return new FRBRnumber(element);
}
else if ("FRBRlanguage".equalsIgnoreCase(nodeName)) {
return new FRBRlanguage(element);
}
else if ("timeInterval".equalsIgnoreCase(nodeName)) {
return new TimeInterval(element);
}
else if ("FRBRdate".equalsIgnoreCase(nodeName)) {
return new FRBRdate(element);
}
else if ("FRBRauthor".equalsIgnoreCase(nodeName)) {
return new FRBRauthor(element);
}
else if ("keyword".equalsIgnoreCase(nodeName)) {
return new Keyword(element);
}
else if ("publication".equalsIgnoreCase(nodeName)) {
return new Publication(element);
}
else if ("FRBRtranslation".equalsIgnoreCase(nodeName)) {
return new FRBRtranslation(element);
}
else if ("header".equalsIgnoreCase(nodeName)) {
return new Header(element);
}
else if ("content".equalsIgnoreCase(nodeName)) {
return new Content(element);
}
else if ("intro".equalsIgnoreCase(nodeName)) {
return new Intro(element);
}
else if ("amendmentJustification".equalsIgnoreCase(nodeName)) {
return new AmendmentJustification(element);
}
else if ("td".equalsIgnoreCase(nodeName)) {
return new Td(element);
}
else if ("th".equalsIgnoreCase(nodeName)) {
return new Th(element);
}
else if ("amendmentReference".equalsIgnoreCase(nodeName)) {
return new AmendmentReference(element);
}
else if ("amendmentContent".equalsIgnoreCase(nodeName)) {
return new AmendmentContent(element);
}
else if ("longTitle".equalsIgnoreCase(nodeName)) {
return new LongTitle(element);
}
else if ("wrap".equalsIgnoreCase(nodeName)) {
return new Wrap(element);
}
else if ("amendmentHeading".equalsIgnoreCase(nodeName)) {
return new AmendmentHeading(element);
}
else if ("other".equalsIgnoreCase(nodeName)) {
return new Other(element);
}
else if ("formula".equalsIgnoreCase(nodeName)) {
return new Formula(element);
}
else if ("bill".equalsIgnoreCase(nodeName)) {
return new Bill(element);
}
else if ("act".equalsIgnoreCase(nodeName)) {
return new Act(element);
}
else if ("judgementBody".equalsIgnoreCase(nodeName)) {
return new JudgementBody(element);
}
else if ("rref".equalsIgnoreCase(nodeName)) {
return new Rref(element);
}
else if ("ref".equalsIgnoreCase(nodeName)) {
return new Ref(element);
}
else if ("eol".equalsIgnoreCase(nodeName)) {
return new Eol(element);
}
else if ("eop".equalsIgnoreCase(nodeName)) {
return new Eop(element);
}
else if ("noteRef".equalsIgnoreCase(nodeName)) {
return new NoteRef(element);
}
else if ("br".equalsIgnoreCase(nodeName)) {
return new Br(element);
}
else if ("img".equalsIgnoreCase(nodeName)) {
return new Img(element);
}
else if ("amendmentBody".equalsIgnoreCase(nodeName)) {
return new AmendmentBody(element);
}
else if ("preamble".equalsIgnoreCase(nodeName)) {
return new Preamble(element);
}
else if ("judicial".equalsIgnoreCase(nodeName)) {
return new Judicial(element);
}
else if ("mod".equalsIgnoreCase(nodeName)) {
return new Mod(element);
}
else if ("mmod".equalsIgnoreCase(nodeName)) {
return new Mmod(element);
}
else if ("rmod".equalsIgnoreCase(nodeName)) {
return new Rmod(element);
}
else if ("efficacy".equalsIgnoreCase(nodeName)) {
return new Efficacy(element);
}
else if ("force".equalsIgnoreCase(nodeName)) {
return new Force(element);
}
else if ("application".equalsIgnoreCase(nodeName)) {
return new Application(element);
}
else if ("duration".equalsIgnoreCase(nodeName)) {
return new Duration(element);
}
else if ("references".equalsIgnoreCase(nodeName)) {
return new References(element);
}
else if ("collectionBody".equalsIgnoreCase(nodeName)) {
return new CollectionBody(element);
}
else if ("preface".equalsIgnoreCase(nodeName)) {
return new Preface(element);
}
else if ("quorum".equalsIgnoreCase(nodeName)) {
return new Quorum(element);
}
else if ("count".equalsIgnoreCase(nodeName)) {
return new Count(element);
}
else if ("debate".equalsIgnoreCase(nodeName)) {
return new Debate(element);
}
else if ("textualMod".equalsIgnoreCase(nodeName)) {
return new TextualMod(element);
}
else if ("scopeMod".equalsIgnoreCase(nodeName)) {
return new ScopeMod(element);
}
else if ("legalSystemMod".equalsIgnoreCase(nodeName)) {
return new LegalSystemMod(element);
}
else if ("meaningMod".equalsIgnoreCase(nodeName)) {
return new MeaningMod(element);
}
else if ("efficacyMod".equalsIgnoreCase(nodeName)) {
return new EfficacyMod(element);
}
else if ("forceMod".equalsIgnoreCase(nodeName)) {
return new ForceMod(element);
}
else if ("supports".equalsIgnoreCase(nodeName)) {
return new Supports(element);
}
else if ("contrasts".equalsIgnoreCase(nodeName)) {
return new Contrasts(element);
}
else if ("restricts".equalsIgnoreCase(nodeName)) {
return new Restricts(element);
}
else if ("putsInQuestion".equalsIgnoreCase(nodeName)) {
return new PutsInQuestion(element);
}
else if ("applies".equalsIgnoreCase(nodeName)) {
return new Applies(element);
}
else if ("distinguishes".equalsIgnoreCase(nodeName)) {
return new Distinguishes(element);
}
else if ("isAnalogTo".equalsIgnoreCase(nodeName)) {
return new IsAnalogTo(element);
}
else if ("dissentsFrom".equalsIgnoreCase(nodeName)) {
return new DissentsFrom(element);
}
else if ("overrules".equalsIgnoreCase(nodeName)) {
return new Overrules(element);
}
else if ("derogates".equalsIgnoreCase(nodeName)) {
return new Derogates(element);
}
else if ("extends".equalsIgnoreCase(nodeName)) {
return new Extends(element);
}
else if ("coverPage".equalsIgnoreCase(nodeName)) {
return new CoverPage(element);
}
else if ("conclusions".equalsIgnoreCase(nodeName)) {
return new Conclusions(element);
}
else if ("componentRef".equalsIgnoreCase(nodeName)) {
return new ComponentRef(element);
}
else if ("body".equalsIgnoreCase(nodeName)) {
return new Body(element);
}
else if ("FRBRExpression".equalsIgnoreCase(nodeName)) {
return new FRBRExpression(element);
}
else if ("FRBRItem".equalsIgnoreCase(nodeName)) {
return new FRBRItem(element);
}
else if ("FRBRManifestation".equalsIgnoreCase(nodeName)) {
return new FRBRManifestation(element);
}
else if ("FRBRWork".equalsIgnoreCase(nodeName)) {
return new FRBRWork(element);
}
else if ("activeModifications".equalsIgnoreCase(nodeName)) {
return new ActiveModifications(element);
}
else if ("passiveModifications".equalsIgnoreCase(nodeName)) {
return new PassiveModifications(element);
}
else if ("TLCEvent".equalsIgnoreCase(nodeName)) {
return new TLCEvent(element);
}
else if ("TLCLocation".equalsIgnoreCase(nodeName)) {
return new TLCLocation(element);
}
else if ("passiveRef".equalsIgnoreCase(nodeName)) {
return new PassiveRef(element);
}
else if ("activeRef".equalsIgnoreCase(nodeName)) {
return new ActiveRef(element);
}
else if ("original".equalsIgnoreCase(nodeName)) {
return new Original(element);
}
else if ("TLCConcept".equalsIgnoreCase(nodeName)) {
return new TLCConcept(element);
}
else if ("jurisprudence".equalsIgnoreCase(nodeName)) {
return new Jurisprudence(element);
}
else if ("attachmentOf".equalsIgnoreCase(nodeName)) {
return new AttachmentOf(element);
}
else if ("TLCObject".equalsIgnoreCase(nodeName)) {
return new TLCObject(element);
}
else if ("TLCPerson".equalsIgnoreCase(nodeName)) {
return new TLCPerson(element);
}
else if ("TLCReference".equalsIgnoreCase(nodeName)) {
return new TLCReference(element);
}
else if ("TLCRole".equalsIgnoreCase(nodeName)) {
return new TLCRole(element);
}
else if ("TLCProcess".equalsIgnoreCase(nodeName)) {
return new TLCProcess(element);
}
else if ("hasAttachment".equalsIgnoreCase(nodeName)) {
return new HasAttachment(element);
}
else if ("TLCOrganization".equalsIgnoreCase(nodeName)) {
return new TLCOrganization(element);
}
else if ("TLCTerm".equalsIgnoreCase(nodeName)) {
return new TLCTerm(element);
}
else if ("fragmentBody".equalsIgnoreCase(nodeName)) {
return new FragmentBody(element);
}
else if ("summary".equalsIgnoreCase(nodeName)) {
return new Summary(element);
}
else if ("fillIn".equalsIgnoreCase(nodeName)) {
return new FillIn(element);
}
else if ("signature".equalsIgnoreCase(nodeName)) {
return new Signature(element);
}
else if ("vote".equalsIgnoreCase(nodeName)) {
return new Vote(element);
}
else if ("listIntroduction".equalsIgnoreCase(nodeName)) {
return new ListIntroduction(element);
}
else if ("docPurpose".equalsIgnoreCase(nodeName)) {
return new DocPurpose(element);
}
else if ("date".equalsIgnoreCase(nodeName)) {
return new Date(element);
}
else if ("quotedText".equalsIgnoreCase(nodeName)) {
return new QuotedText(element);
}
else if ("inline".equalsIgnoreCase(nodeName)) {
return new Inline(element);
}
else if ("relatedDocument".equalsIgnoreCase(nodeName)) {
return new RelatedDocument(element);
}
else if ("docIntroducer".equalsIgnoreCase(nodeName)) {
return new DocIntroducer(element);
}
else if ("b".equalsIgnoreCase(nodeName)) {
return new B(element);
}
else if ("a".equalsIgnoreCase(nodeName)) {
return new A(element);
}
else if ("i".equalsIgnoreCase(nodeName)) {
return new I(element);
}
else if ("num".equalsIgnoreCase(nodeName)) {
return new Num(element);
}
else if ("u".equalsIgnoreCase(nodeName)) {
return new U(element);
}
else if ("p".equalsIgnoreCase(nodeName)) {
return new P(element);
}
else if ("docType".equalsIgnoreCase(nodeName)) {
return new DocType(element);
}
else if ("change".equalsIgnoreCase(nodeName)) {
return new Change(element);
}
else if ("opinion".equalsIgnoreCase(nodeName)) {
return new Opinion(element);
}
else if ("docStage".equalsIgnoreCase(nodeName)) {
return new DocStage(element);
}
else if ("docCommittee".equalsIgnoreCase(nodeName)) {
return new DocCommittee(element);
}
else if ("docNumber".equalsIgnoreCase(nodeName)) {
return new DocNumber(element);
}
else if ("extractText".equalsIgnoreCase(nodeName)) {
return new ExtractText(element);
}
else if ("span".equalsIgnoreCase(nodeName)) {
return new Span(element);
}
else if ("sub".equalsIgnoreCase(nodeName)) {
return new Sub(element);
}
else if ("sup".equalsIgnoreCase(nodeName)) {
return new Sup(element);
}
else if ("docketNumber".equalsIgnoreCase(nodeName)) {
return new DocketNumber(element);
}
else if ("mref".equalsIgnoreCase(nodeName)) {
return new Mref(element);
}
else if ("neutralCitation".equalsIgnoreCase(nodeName)) {
return new NeutralCitation(element);
}
else if ("docStatus".equalsIgnoreCase(nodeName)) {
return new DocStatus(element);
}
else if ("legislature".equalsIgnoreCase(nodeName)) {
return new Legislature(element);
}
else if ("tocItem".equalsIgnoreCase(nodeName)) {
return new TocItem(element);
}
else if ("session".equalsIgnoreCase(nodeName)) {
return new Session(element);
}
else if ("recordedTime".equalsIgnoreCase(nodeName)) {
return new RecordedTime(element);
}
else if ("scene".equalsIgnoreCase(nodeName)) {
return new Scene(element);
}
else if ("heading".equalsIgnoreCase(nodeName)) {
return new Heading(element);
}
else if ("block".equalsIgnoreCase(nodeName)) {
return new Block(element);
}
else if ("docJurisdiction".equalsIgnoreCase(nodeName)) {
return new DocJurisdiction(element);
}
else if ("docProponent".equalsIgnoreCase(nodeName)) {
return new DocProponent(element);
}
else if ("omissis".equalsIgnoreCase(nodeName)) {
return new Omissis(element);
}
else if ("def".equalsIgnoreCase(nodeName)) {
return new Def(element);
}
else if ("docTitle".equalsIgnoreCase(nodeName)) {
return new DocTitle(element);
}
else if ("del".equalsIgnoreCase(nodeName)) {
return new Del(element);
}
else if ("affectedDocument".equalsIgnoreCase(nodeName)) {
return new AffectedDocument(element);
}
else if ("placeholder".equalsIgnoreCase(nodeName)) {
return new Placeholder(element);
}
else if ("caption".equalsIgnoreCase(nodeName)) {
return new Caption(element);
}
else if ("outcome".equalsIgnoreCase(nodeName)) {
return new Outcome(element);
}
else if ("shortTitle".equalsIgnoreCase(nodeName)) {
return new ShortTitle(element);
}
else if ("remark".equalsIgnoreCase(nodeName)) {
return new Remark(element);
}
else if ("narrative".equalsIgnoreCase(nodeName)) {
return new Narrative(element);
}
else if ("listConclusion".equalsIgnoreCase(nodeName)) {
return new ListConclusion(element);
}
else if ("ins".equalsIgnoreCase(nodeName)) {
return new Ins(element);
}
else if ("subheading".equalsIgnoreCase(nodeName)) {
return new Subheading(element);
}
else if ("courtType".equalsIgnoreCase(nodeName)) {
return new CourtType(element);
}
else if ("from".equalsIgnoreCase(nodeName)) {
return new From(element);
}
else if ("docDate".equalsIgnoreCase(nodeName)) {
return new DocDate(element);
}
else if ("introduction".equalsIgnoreCase(nodeName)) {
return new Introduction(element);
}
else if ("background".equalsIgnoreCase(nodeName)) {
return new Background(element);
}
else if ("mainBody".equalsIgnoreCase(nodeName)) {
return new MainBody(element);
}
else if ("motivation".equalsIgnoreCase(nodeName)) {
return new Motivation(element);
}
else if ("decision".equalsIgnoreCase(nodeName)) {
return new Decision(element);
}
else if ("answer".equalsIgnoreCase(nodeName)) {
return new Answer(element);
}
else if ("speech".equalsIgnoreCase(nodeName)) {
return new Speech(element);
}
else if ("question".equalsIgnoreCase(nodeName)) {
return new Question(element);
}
else if ("tome".equalsIgnoreCase(nodeName)) {
return new Tome(element);
}
else if ("division".equalsIgnoreCase(nodeName)) {
return new Division(element);
}
else if ("part".equalsIgnoreCase(nodeName)) {
return new Part(element);
}
else if ("subchapter".equalsIgnoreCase(nodeName)) {
return new Subchapter(element);
}
else if ("subdivision".equalsIgnoreCase(nodeName)) {
return new Subdivision(element);
}
else if ("subsection".equalsIgnoreCase(nodeName)) {
return new Subsection(element);
}
else if ("transitional".equalsIgnoreCase(nodeName)) {
return new Transitional(element);
}
else if ("chapter".equalsIgnoreCase(nodeName)) {
return new Chapter(element);
}
else if ("clause".equalsIgnoreCase(nodeName)) {
return new Clause(element);
}
else if ("paragraph".equalsIgnoreCase(nodeName)) {
return new Paragraph(element);
}
else if ("subclause".equalsIgnoreCase(nodeName)) {
return new Subclause(element);
}
else if ("sublist".equalsIgnoreCase(nodeName)) {
return new Sublist(element);
}
else if ("subparagraph".equalsIgnoreCase(nodeName)) {
return new Subparagraph(element);
}
else if ("title".equalsIgnoreCase(nodeName)) {
return new Title(element);
}
else if ("point".equalsIgnoreCase(nodeName)) {
return new Point(element);
}
else if ("article".equalsIgnoreCase(nodeName)) {
return new Article(element);
}
else if ("hcontainer".equalsIgnoreCase(nodeName)) {
return new Hcontainer(element);
}
else if ("alinea".equalsIgnoreCase(nodeName)) {
return new Alinea(element);
}
else if ("indent".equalsIgnoreCase(nodeName)) {
return new Indent(element);
}
else if ("list".equalsIgnoreCase(nodeName)) {
return new List(element);
}
else if ("section".equalsIgnoreCase(nodeName)) {
return new Section(element);
}
else if ("subpart".equalsIgnoreCase(nodeName)) {
return new Subpart(element);
}
else if ("subtitle".equalsIgnoreCase(nodeName)) {
return new Subtitle(element);
}
else if ("book".equalsIgnoreCase(nodeName)) {
return new Book(element);
}
else if ("citation".equalsIgnoreCase(nodeName)) {
return new Citation(element);
}
else if ("item".equalsIgnoreCase(nodeName)) {
return new Item(element);
}
else if ("tblock".equalsIgnoreCase(nodeName)) {
return new Tblock(element);
}
else if ("recital".equalsIgnoreCase(nodeName)) {
return new Recital(element);
}
else if ("administrationOfOath".equalsIgnoreCase(nodeName)) {
return new AdministrationOfOath(element);
}
else if ("papers".equalsIgnoreCase(nodeName)) {
return new Papers(element);
}
else if ("proceduralMotions".equalsIgnoreCase(nodeName)) {
return new ProceduralMotions(element);
}
else if ("nationalInterest".equalsIgnoreCase(nodeName)) {
return new NationalInterest(element);
}
else if ("noticesOfMotion".equalsIgnoreCase(nodeName)) {
return new NoticesOfMotion(element);
}
else if ("adjournment".equalsIgnoreCase(nodeName)) {
return new Adjournment(element);
}
else if ("communication".equalsIgnoreCase(nodeName)) {
return new Communication(element);
}
else if ("oralStatements".equalsIgnoreCase(nodeName)) {
return new OralStatements(element);
}
else if ("questions".equalsIgnoreCase(nodeName)) {
return new Questions(element);
}
else if ("debateSection".equalsIgnoreCase(nodeName)) {
return new DebateSection(element);
}
else if ("personalStatements".equalsIgnoreCase(nodeName)) {
return new PersonalStatements(element);
}
else if ("pointOfOrder".equalsIgnoreCase(nodeName)) {
return new PointOfOrder(element);
}
else if ("declarationOfVote".equalsIgnoreCase(nodeName)) {
return new DeclarationOfVote(element);
}
else if ("petitions".equalsIgnoreCase(nodeName)) {
return new Petitions(element);
}
else if ("resolutions".equalsIgnoreCase(nodeName)) {
return new Resolutions(element);
}
else if ("rollCall".equalsIgnoreCase(nodeName)) {
return new RollCall(element);
}
else if ("address".equalsIgnoreCase(nodeName)) {
return new Address(element);
}
else if ("writtenStatements".equalsIgnoreCase(nodeName)) {
return new WrittenStatements(element);
}
else if ("prayers".equalsIgnoreCase(nodeName)) {
return new Prayers(element);
}
else if ("ministerialStatements".equalsIgnoreCase(nodeName)) {
return new MinisterialStatements(element);
}
else if ("domain".equalsIgnoreCase(nodeName)) {
return new Domain(element);
}
else if ("new".equalsIgnoreCase(nodeName)) {
return new New(element);
}
else if ("condition".equalsIgnoreCase(nodeName)) {
return new Condition(element);
}
else if ("otherAnalysis".equalsIgnoreCase(nodeName)) {
return new OtherAnalysis(element);
}
else if ("foreign".equalsIgnoreCase(nodeName)) {
return new Foreign(element);
}
else if ("result".equalsIgnoreCase(nodeName)) {
return new Result(element);
}
else if ("eventRef".equalsIgnoreCase(nodeName)) {
return new EventRef(element);
}
else if ("proprietary".equalsIgnoreCase(nodeName)) {
return new Proprietary(element);
}
else if ("old".equalsIgnoreCase(nodeName)) {
return new Old(element);
}
else if ("presentation".equalsIgnoreCase(nodeName)) {
return new Presentation(element);
}
else if ("step".equalsIgnoreCase(nodeName)) {
return new Step(element);
}
else if ("preservation".equalsIgnoreCase(nodeName)) {
return new Preservation(element);
}
else if ("debateBody".equalsIgnoreCase(nodeName)) {
return new DebateBody(element);
}
else if ("party".equalsIgnoreCase(nodeName)) {
return new Party(element);
}
else if ("event".equalsIgnoreCase(nodeName)) {
return new Event(element);
}
else if ("role".equalsIgnoreCase(nodeName)) {
return new Role(element);
}
else if ("quantity".equalsIgnoreCase(nodeName)) {
return new Quantity(element);
}
else if ("entity".equalsIgnoreCase(nodeName)) {
return new Entity(element);
}
else if ("organization".equalsIgnoreCase(nodeName)) {
return new Organization(element);
}
else if ("person".equalsIgnoreCase(nodeName)) {
return new Person(element);
}
else if ("judge".equalsIgnoreCase(nodeName)) {
return new Judge(element);
}
else if ("process".equalsIgnoreCase(nodeName)) {
return new Process(element);
}
else if ("location".equalsIgnoreCase(nodeName)) {
return new Location(element);
}
else if ("lawyer".equalsIgnoreCase(nodeName)) {
return new Lawyer(element);
}
else if ("concept".equalsIgnoreCase(nodeName)) {
return new Concept(element);
}
else if ("object".equalsIgnoreCase(nodeName)) {
return new Object(element);
}
else if ("term".equalsIgnoreCase(nodeName)) {
return new Term(element);
}
else if ("note".equalsIgnoreCase(nodeName)) {
return new Note(element);
}
else if ("div".equalsIgnoreCase(nodeName)) {
return new Div(element);
}
else if ("interstitial".equalsIgnoreCase(nodeName)) {
return new Interstitial(element);
}
else if ("fragment".equalsIgnoreCase(nodeName)) {
return new Fragment(element);
}
else if ("quotedStructure".equalsIgnoreCase(nodeName)) {
return new QuotedStructure(element);
}
else if ("extractStructure".equalsIgnoreCase(nodeName)) {
return new ExtractStructure(element);
}
else if ("popup".equalsIgnoreCase(nodeName)) {
return new Popup(element);
}
else if ("authorialNote".equalsIgnoreCase(nodeName)) {
return new AuthorialNote(element);
}
else if ("source".equalsIgnoreCase(nodeName)) {
return new Source(element);
}
else if ("destination".equalsIgnoreCase(nodeName)) {
return new Destination(element);
}
else if ("doc".equalsIgnoreCase(nodeName)) {
return new Doc(element);
}
else if ("debateReport".equalsIgnoreCase(nodeName)) {
return new DebateReport(element);
}
else if ("marker".equalsIgnoreCase(nodeName)) {
return new Marker(element);
}
else if ("amendmentList".equalsIgnoreCase(nodeName)) {
return new AmendmentList(element);
}
else if ("documentCollection".equalsIgnoreCase(nodeName)) {
return new DocumentCollection(element);
}
else if ("officialGazette".equalsIgnoreCase(nodeName)) {
return new OfficialGazette(element);
}
else if ("components".equalsIgnoreCase(nodeName)) {
return new Components(element);
}
else if ("meta".equalsIgnoreCase(nodeName)) {
return new Meta(element);
}
else if ("temporalData".equalsIgnoreCase(nodeName)) {
return new TemporalData(element);
}
else if ("notes".equalsIgnoreCase(nodeName)) {
return new Notes(element);
}
else if ("tr".equalsIgnoreCase(nodeName)) {
return new Tr(element);
}
else if ("component".equalsIgnoreCase(nodeName)) {
return new Component(element);
}
else if ("workflow".equalsIgnoreCase(nodeName)) {
return new Workflow(element);
}
else if ("toc".equalsIgnoreCase(nodeName)) {
return new Toc(element);
}
else if ("analysis".equalsIgnoreCase(nodeName)) {
return new Analysis(element);
}
else if ("citations".equalsIgnoreCase(nodeName)) {
return new Citations(element);
}
else if ("recitals".equalsIgnoreCase(nodeName)) {
return new Recitals(element);
}
else if ("lifecycle".equalsIgnoreCase(nodeName)) {
return new Lifecycle(element);
}
else if ("table".equalsIgnoreCase(nodeName)) {
return new Table(element);
}
else if ("componentData".equalsIgnoreCase(nodeName)) {
return new ComponentData(element);
}
else if ("classification".equalsIgnoreCase(nodeName)) {
return new Classification(element);
}
else if ("blockList".equalsIgnoreCase(nodeName)) {
return new BlockList(element);
}
else if ("temporalGroup".equalsIgnoreCase(nodeName)) {
return new TemporalGroup(element);
}
else if ("li".equalsIgnoreCase(nodeName)) {
return new Li(element);
}
else if ("componentInfo".equalsIgnoreCase(nodeName)) {
return new ComponentInfo(element);
}
else if ("attachments".equalsIgnoreCase(nodeName)) {
return new Attachments(element);
}
else if ("identification".equalsIgnoreCase(nodeName)) {
return new Identification(element);
}
// nothing found
LOG.warning("Could not find overlay element (nodename: " + nodeName + " in namespace URI '" + namespaceURI + "')");
return null;
}
}