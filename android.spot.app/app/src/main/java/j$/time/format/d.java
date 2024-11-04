package j$.time.format;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class d implements f {
    private final char a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(char c) {
        this.a = c;
    }

    @Override // j$.time.format.f
    public final boolean k(p pVar, StringBuilder sb) {
        sb.append(this.a);
        return true;
    }

    public final String toString() {
        char c = this.a;
        if (c == '\'') {
            return "''";
        }
        return "'" + c + "'";
    }
}
