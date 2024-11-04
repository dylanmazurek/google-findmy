package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jdy extends jdv {
    public static final jeb a = new jdy();

    private jdy() {
        super("CharMatcher.none()");
    }

    @Override // defpackage.jeb
    public final boolean c(char c) {
        return false;
    }

    @Override // defpackage.jeb
    public final boolean f(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.jeb
    public final boolean g(CharSequence charSequence) {
        return true;
    }

    @Override // defpackage.jeb
    public final int h(CharSequence charSequence) {
        return -1;
    }

    @Override // defpackage.jeb
    public final int i(CharSequence charSequence, int i) {
        hwx.aa(0, charSequence.length());
        return -1;
    }

    @Override // defpackage.jeb
    public final jeb e(jeb jebVar) {
        return jebVar;
    }
}
