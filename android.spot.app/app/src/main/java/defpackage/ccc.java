package defpackage;

import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccc extends mnp implements mol {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccc(mmx mmxVar, int i) {
        super(2, mmxVar);
        this.a = i;
    }

    @Override // defpackage.mol
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.a != 0) {
            return new ccc((mmx) obj2, 1, null).b(mlh.a);
        }
        return new ccc((mmx) obj2, 0).b(mlh.a);
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        if (this.a != 0) {
            mjo.o(obj);
            return Choreographer.getInstance();
        }
        mjo.o(obj);
        return mlh.a;
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        if (this.a != 0) {
            return new ccc(mmxVar, 1, null);
        }
        return new ccc(mmxVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccc(mmx mmxVar, int i, byte[] bArr) {
        super(2, mmxVar);
        this.a = i;
    }
}
