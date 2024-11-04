package defpackage;

import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jtg extends iqg {
    public final Charset a;
    public final /* synthetic */ iqg b;

    public jtg(iqg iqgVar, Charset charset) {
        this.b = iqgVar;
        charset.getClass();
        this.a = charset;
    }

    public final String toString() {
        Charset charset = this.a;
        return this.b.toString() + ".asCharSource(" + charset.toString() + ")";
    }
}
