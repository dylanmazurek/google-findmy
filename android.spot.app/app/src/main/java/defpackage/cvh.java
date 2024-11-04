package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvh extends cio {
    public cvh(cih cihVar) {
        super(cihVar);
    }

    @Override // defpackage.cio
    public final String a() {
        return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
    }
}
