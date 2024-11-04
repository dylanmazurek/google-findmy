package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lhy implements lkx {
    private static final lja a;

    static {
        lja ljaVar = lja.a;
        lkz lkzVar = lkz.a;
        a = lja.a;
    }

    private static final void l(lkq lkqVar) {
        if (lkqVar != null && !lkqVar.u()) {
            throw new llo().a();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [lkq, java.lang.Object] */
    @Override // defpackage.lkx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lkq h(InputStream inputStream, lja ljaVar) {
        liq J = liq.J(inputStream);
        ?? k = k(J, ljaVar);
        J.z(0);
        l(k);
        return k;
    }

    @Override // defpackage.lkx
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final lkq i(byte[] bArr, lja ljaVar) {
        return c(bArr, 0, bArr.length, ljaVar);
    }

    public final lkq c(byte[] bArr, int i, int i2, lja ljaVar) {
        lkq d = d(bArr, i, i2, ljaVar);
        l(d);
        return d;
    }

    public lkq d(byte[] bArr, int i, int i2, lja ljaVar) {
        throw null;
    }

    @Override // defpackage.lkx
    public final /* bridge */ /* synthetic */ Object e(InputStream inputStream) {
        return h(inputStream, a);
    }

    @Override // defpackage.lkx
    public final /* bridge */ /* synthetic */ Object f(byte[] bArr) {
        return i(bArr, a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [lkq, java.lang.Object] */
    @Override // defpackage.lkx
    public final /* bridge */ /* synthetic */ Object g(liq liqVar, lja ljaVar) {
        ?? k = k(liqVar, ljaVar);
        l(k);
        return k;
    }

    @Override // defpackage.lkx
    public final /* bridge */ /* synthetic */ Object j(byte[] bArr, int i, lja ljaVar) {
        return c(bArr, 1, i, ljaVar);
    }
}
