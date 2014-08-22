package com.sarhanm.versioner

/**
 * Extension closure to pass parameters from the build script
 * to the plugin
 *
 * Example:
 *
 * build.gradle:
 *
 *     versioner{
 *         snapshot = true
 *     }
 *
 *
 * @author mohammad sarhan
 */
class VersionerPluginExtension {
    def boolean snapshot = false
    def String solidBranchRegex = Versioner.DEFAULT_SOLID_BRANCH_REGEX
    def String commonHotfixBranch = Versioner.DEFAULT_HOTFIX_COMMON_BRANCH
}
