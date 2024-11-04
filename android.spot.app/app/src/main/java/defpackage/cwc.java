package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwc extends cio {
    public cwc(cih cihVar) {
        super(cihVar);
    }

    @Override // defpackage.cio
    public final String a() {
        return "UPDATE workspec SET generation=generation+1 WHERE id=?";
    }
}
