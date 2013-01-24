/**
 * Nsesa wrapper plugin.
 *
 */

(function()
{
    CKEDITOR.plugins.add( 'nsesa',
        {
            requires : [ 'keystrokes'],
            beforeInit : function( editor )
            {
                CKEDITOR.nsesaBeforeInit(editor);
            },
            init : function( editor )
            {
                var buttonName = "NsesaToggle";
                var cmd = {
                    exec: function(editor) {
                        editor.getCommand(buttonName).toggleState();
                        var nsesaState = editor.getCommand(buttonName).state;
                        var nsesaToggle = {nsesaToggleDraft : (nsesaState == CKEDITOR.TRISTATE_ON)};
                        editor.fire("nsesaToggleDraft", nsesaToggle);
                    }
                }
                editor.addCommand(buttonName, cmd);
                editor.ui.addButton(buttonName,{
                    label:"Toggle Drafting tool",
                    icon:this.path + "nsesaDraftingTool.png",
                    command: buttonName
                });
                CKEDITOR.nsesaInit(editor);

            }
        });


})();

