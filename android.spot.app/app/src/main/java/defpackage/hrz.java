package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hrz {
    public int a;
    public jer b;
    public byte c;
    public int d;

    public hrz() {
        throw null;
    }

    public final hsa a() {
        int i;
        if (this.c == 3 && (i = this.d) != 0) {
            hsa hsaVar = new hsa(i, this.a, this.b);
            hwx.K(true, "only one of auto url auto sanitization and custom url sanitizer can be enabled.");
            return hsaVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == 0) {
            sb.append(" enablement");
        }
        if ((this.c & 1) == 0) {
            sb.append(" batchSize");
        }
        if ((this.c & 2) == 0) {
            sb.append(" enableUrlAutoSanitization");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        int i;
        if (true != z) {
            i = 2;
        } else {
            i = 3;
        }
        this.d = i;
    }

    public hrz(byte[] bArr) {
        this.b = jdl.a;
    }
}
