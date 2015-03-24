package dk.aau.cs.psylog.unansweredcalls;

import dk.aau.cs.psylog.module_lib.ScheduledService;

public class PsyLogService extends ScheduledService{

    public PsyLogService() {
        super("PsyLogIntentService-UnansweredCalls");
    }

    @Override
    public void setScheduledTask() {
        scheduledTask = new UnansweredCallsListener(this);
    }
}
