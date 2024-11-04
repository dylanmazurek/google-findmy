package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum loa implements ljp {
    NOT_SET(0),
    CPS_APP_PROCESS_GLOBAL_PROVIDER(1),
    NON_CPS_APP_PROCESS_GLOBAL_PROVIDER(2),
    LOGGER_OVERRIDE_PROVIDER(3),
    LOGGER_DEFERRING_PROVIDER(4),
    EVENT_OVERRIDE(5),
    EVENT_DEFERRING(6),
    LOG_SOURCE_MAPPED(7),
    SERVER_INFRASTRUCTURE(8),
    LOG_REQUEST_SETTER_WEB(9),
    PRIVACY_CONTEXT_RESOLVER(10);

    public final int l;

    loa(int i) {
        this.l = i;
    }

    @Override // defpackage.ljp
    public final int a() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}
