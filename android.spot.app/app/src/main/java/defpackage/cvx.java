package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvx extends cio {
    public cvx(cih cihVar) {
        super(cihVar);
    }

    @Override // defpackage.cio
    public final String a() {
        return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
    }
}
