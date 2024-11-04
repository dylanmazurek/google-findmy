package j$.nio.file;

/* loaded from: classes2.dex */
final class E implements H {
    private final String a;
    private final Class b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E(Class cls, String str) {
        this.a = str;
        this.b = cls;
    }

    @Override // j$.nio.file.H
    public final String name() {
        return this.a;
    }

    public final String toString() {
        return this.a;
    }

    @Override // j$.nio.file.H
    public final Class type() {
        return this.b;
    }
}
