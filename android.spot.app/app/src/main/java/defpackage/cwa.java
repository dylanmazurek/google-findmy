package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwa extends cio {
    public cwa(cih cihVar) {
        super(cihVar);
    }

    @Override // defpackage.cio
    public final String a() {
        return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
    }
}
