package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exe extends mnp implements mol {
    /* synthetic */ Object a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exe(int i, mmx mmxVar) {
        super(2, mmxVar);
        this.b = i;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((exe) c((evx) obj, (mmx) obj2)).b(mlh.a);
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        mjo.o(obj);
        evx evxVar = (evx) this.a;
        ljh ljhVar = (ljh) evxVar.z(5);
        ljhVar.w(evxVar);
        if (!ljhVar.b.y()) {
            ljhVar.t();
        }
        int i = this.b;
        evx evxVar2 = (evx) ljhVar.b;
        evx evxVar3 = evx.c;
        evxVar2.a |= 1;
        evxVar2.b = i;
        ljn q = ljhVar.q();
        q.getClass();
        return (evx) q;
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        exe exeVar = new exe(this.b, mmxVar);
        exeVar.a = obj;
        return exeVar;
    }
}
