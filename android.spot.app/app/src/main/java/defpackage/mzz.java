package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class mzz extends mye implements mys {
    public mzz(int i) {
        super(1, Integer.MAX_VALUE, 2);
        d(Integer.valueOf(i));
    }

    @Override // defpackage.mys
    public final /* bridge */ /* synthetic */ Object c() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(((Number) g()).intValue());
        }
        return valueOf;
    }

    public final void n(int i) {
        synchronized (this) {
            d(Integer.valueOf(((Number) g()).intValue() + i));
        }
    }
}
