package org.jenkinsci.tools.configcloner.handler;

import java.util.List;

import org.apache.commons.lang.NotImplementedException;
import org.jenkinsci.tools.configcloner.CommandResponse;
import org.jenkinsci.tools.configcloner.ConfigTransfer;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

@Parameters(commandDescription = "Clone node configuration. NOT IMPLEMENTED.")
public class CloneNode extends Handler {

    @Parameter(description = "[<SRC>] [<DST>...]")
    private List<String> nodes;

    public CloneNode(final ConfigTransfer config) {

        super(config);
    }

    @Override
    public CommandResponse run(final CommandResponse response) {

        throw new NotImplementedException();
    }
}
