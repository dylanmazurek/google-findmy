package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kdz extends kdx {
    public static final kdz a = new kdz("DHKEM_P256_HKDF_SHA256", 16);
    public static final kdz b = new kdz("DHKEM_P384_HKDF_SHA384", 17);
    public static final kdz c = new kdz("DHKEM_P521_HKDF_SHA512", 18);
    public static final kdz f = new kdz("DHKEM_X25519_HKDF_SHA256", 32);

    private kdz(String str, int i) {
        super(str, i);
    }
}
