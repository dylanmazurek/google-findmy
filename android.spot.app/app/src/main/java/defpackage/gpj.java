package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpj {
    public static final joo a = joo.m("GnpSdk");

    public static final jer a(byte[] bArr) {
        return jer.h(b(bArr));
    }

    public static final /* synthetic */ lfs b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            ljn m = ljn.m(lfs.g, bArr, 0, bArr.length, lja.a());
            ljn.A(m);
            return (lfs) m;
        } catch (ljy e) {
            ((jol) ((jol) a.f()).i(e)).r("Failed to parse AndroidPayload proto.");
            return null;
        }
    }
}
