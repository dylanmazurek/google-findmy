package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvq extends cio {
    public cvq(cih cihVar) {
        super(cihVar);
    }

    @Override // defpackage.cio
    public final String a() {
        return "DELETE from WorkProgress where work_spec_id=?";
    }
}
