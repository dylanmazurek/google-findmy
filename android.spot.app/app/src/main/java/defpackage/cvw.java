package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvw extends cio {
    public cvw(cih cihVar) {
        super(cihVar);
    }

    @Override // defpackage.cio
    public final String a() {
        return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
    }
}
