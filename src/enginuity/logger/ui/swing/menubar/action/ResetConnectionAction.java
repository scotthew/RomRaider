package enginuity.logger.ui.swing.menubar.action;

import enginuity.logger.EcuLogger;

import java.awt.event.ActionEvent;

public final class ResetConnectionAction extends AbstractAction {

    public ResetConnectionAction(EcuLogger logger) {
        super(logger);
    }

    public void actionPerformed(ActionEvent actionEvent) {
        try {
            logger.restartLogging();
        } catch (Exception e) {
            logger.reportError(e);
        }
    }
}
