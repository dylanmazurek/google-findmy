package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class un extends mnp implements moh {
    Object a;
    Object b;
    int c;
    final /* synthetic */ Object d;
    final /* synthetic */ long e;
    final /* synthetic */ wa f;
    final /* synthetic */ gga g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un(gga ggaVar, Object obj, wa waVar, long j, mmx mmxVar) {
        super(1, mmxVar);
        this.g = ggaVar;
        this.d = obj;
        this.f = waVar;
        this.e = j;
    }

    @Override // defpackage.moh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new un(this.g, this.d, this.f, this.e, (mmx) obj).b(mlh.a);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [moh, java.lang.Object] */
    @Override // defpackage.mnj
    public final Object b(Object obj) {
        Object obj2;
        Object obj3;
        mne mneVar = mne.a;
        int i = 1;
        try {
            if (this.c != 0) {
                obj2 = this.b;
                obj3 = this.a;
                mjo.o(obj);
            } else {
                mjo.o(obj);
                gga ggaVar = this.g;
                ((uv) ggaVar.g).a = (va) ((atk) ggaVar.d).b.a(this.d);
                this.g.g(this.f.b);
                this.g.f(true);
                Object obj4 = this.g.g;
                uv uvVar = new uv(((uv) obj4).e, ((uv) obj4).a(), ql.b(((uv) obj4).a), ((uv) obj4).b, ((uv) obj4).d);
                mpk mpkVar = new mpk();
                wa waVar = this.f;
                long j = this.e;
                ud udVar = new ud(this.g, uvVar, mpkVar, 3);
                this.a = uvVar;
                this.b = mpkVar;
                this.c = 1;
                if (ra.i(uvVar, waVar, j, udVar, this) != mneVar) {
                    obj2 = mpkVar;
                    obj3 = uvVar;
                } else {
                    return mneVar;
                }
            }
            if (true != ((mpk) obj2).a) {
                i = 2;
            }
            this.g.e();
            return new us((uv) obj3, i);
        } catch (CancellationException e) {
            this.g.e();
            throw e;
        }
    }
}
