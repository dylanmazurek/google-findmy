package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kbu {
    public static final kbu a = new kbu("ASSUME_AES_GCM");
    public static final kbu b = new kbu("ASSUME_XCHACHA20POLY1305");
    public static final kbu c = new kbu("ASSUME_CHACHA20POLY1305");
    public static final kbu d = new kbu("ASSUME_AES_CTR_HMAC");
    public static final kbu e = new kbu("ASSUME_AES_EAX");
    public static final kbu f = new kbu("ASSUME_AES_GCM_SIV");
    public final String g;

    private kbu(String str) {
        this.g = str;
    }

    public final String toString() {
        return this.g;
    }
}
