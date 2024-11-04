package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
final class jsf implements jsg {
    public static final jsf a;
    private static final /* synthetic */ jsf[] b;

    static {
        jsf jsfVar = new jsf();
        a = jsfVar;
        b = new jsf[]{jsfVar};
    }

    private jsf() {
    }

    public static jsf[] values() {
        return (jsf[]) b.clone();
    }

    @Override // defpackage.jsg
    public final /* synthetic */ long a(byte[] bArr, int i) {
        if (ordinal() == 0) {
            return iqh.l(bArr[i + 7], bArr[i + 6], bArr[i + 5], bArr[i + 4], bArr[i + 3], bArr[i + 2], bArr[i + 1], bArr[i]);
        }
        throw null;
    }
}
