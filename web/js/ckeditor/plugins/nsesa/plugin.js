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
                CKEDITOR.nsesaInit(editor);

            }
        });


})();

