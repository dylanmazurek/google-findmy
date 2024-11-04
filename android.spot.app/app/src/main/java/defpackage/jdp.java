package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jdp extends jdv {
    public static final jeb a = new jdp();

    public jdp() {
        super("CharMatcher.ascii()");
    }

    @Override // defpackage.jeb
    public final boolean c(char c) {
        if (c <= 127) {
            return true;
        }
        return false;
    }
}
