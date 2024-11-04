package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfn {
    public final String a;
    public final mol b;
    public boolean c;

    public bfn(String str, mol molVar) {
        this.a = str;
        this.b = molVar;
    }

    public final String toString() {
        return "AccessibilityKey: ".concat(this.a);
    }

    public /* synthetic */ bfn(String str) {
        this(str, bfm.a);
    }

    public bfn(String str, byte[] bArr) {
        this(str);
        this.c = true;
    }

    public bfn(String str, boolean z, mol molVar) {
        this(str, molVar);
        this.c = z;
    }
}
