package ftl.cli.firebase.test.networkprofiles

import flank.common.logLn
import ftl.environment.networkConfigurationAsTable
import picocli.CommandLine

@CommandLine.Command(
    name = "list",
    sortOptions = false,
    headerHeading = "",
    synopsisHeading = "%n",
    descriptionHeading = "%n@|bold,underline Description:|@%n%n",
    parameterListHeading = "%n@|bold,underline Parameters:|@%n",
    optionListHeading = "%n@|bold,underline Options:|@%n",
    header = ["List all network profiles available for testing "],
    usageHelpAutoWidth = true
)
class NetworkProfilesListCommand : Runnable {
    override fun run() {
        logLn("fetching available network profiles...")
        logLn(networkConfigurationAsTable())
    }
}
