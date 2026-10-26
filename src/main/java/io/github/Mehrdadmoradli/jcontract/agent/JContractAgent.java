package io.github.Mehrdadmoradli.jcontract.agent;

import java.lang.instrument.Instrumentation;

public final class JContractAgent {

    private JContractAgent() {
    }

    public static void premain(
            String agentArgs,
            Instrumentation instrumentation) {

        System.out.println("JContract agent started");
    }
}
