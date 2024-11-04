package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cap extends mnp implements mol {
    Object a;
    Object b;
    Object c;
    int d;
    /* synthetic */ Object e;
    final /* synthetic */ List f;
    final /* synthetic */ List g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cap(List list, List list2, mmx mmxVar) {
        super(2, mmxVar);
        this.f = list;
        this.g = list2;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cap) c(obj, (mmx) obj2)).b(mlh.a);
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                mjo.o(obj);
                return obj;
            }
            List list = (List) this.e;
            mjo.o(obj);
            if (!((Boolean) obj).booleanValue()) {
                return null;
            }
            list.add(new cao((cam) null, (mmx) null, 0));
            this.e = list;
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = 2;
            throw null;
        }
        mjo.o(obj);
        return this.e;
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        cap capVar = new cap(this.f, this.g, mmxVar);
        capVar.e = obj;
        return capVar;
    }
}
