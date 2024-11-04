package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class anl extends mpe implements moh {
    final /* synthetic */ moh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anl(moh mohVar) {
        super(1);
        this.a = mohVar;
    }

    @Override // defpackage.moh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        amz amzVar = (amz) this.a.a((anf) obj);
        synchronized (anm.c) {
            anm.d = anm.d.d(amzVar.v());
        }
        return amzVar;
    }
}
