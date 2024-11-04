package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxw {
    public static final void a(ghh ghhVar) {
        lcn lcnVar;
        if (ghhVar != null) {
            lcnVar = ghhVar.c;
        } else {
            lcnVar = null;
        }
        if (lcnVar == null) {
            return;
        }
        switch (lcnVar) {
            case UNKNOWN:
            case DELIVERED_FCM_PUSH:
            case SCHEDULED_RECEIVER:
            case FETCHED_LATEST_THREADS:
            case FETCHED_UPDATED_THREADS:
            case LOCAL_NOTIFICATION_CREATED:
            case LOCAL_NOTIFICATION_UPDATED:
                return;
            default:
                throw new mku();
        }
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
