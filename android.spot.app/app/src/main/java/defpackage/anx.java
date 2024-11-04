package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class anx extends mpe implements moh {
    final /* synthetic */ anz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anx(anz anzVar) {
        super(1);
        this.a = anzVar;
    }

    @Override // defpackage.moh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        anz anzVar = this.a;
        synchronized (anzVar.f) {
            anv anvVar = anzVar.h;
            anvVar.getClass();
            Object obj2 = anvVar.b;
            obj2.getClass();
            int i = anvVar.c;
            sr srVar = anvVar.h;
            if (srVar == null) {
                srVar = new sr((byte[]) null);
                anvVar.h = srVar;
                anvVar.j.e(obj2, srVar);
            }
            anvVar.b(obj, i, obj2, srVar);
        }
        return mlh.a;
    }
}
