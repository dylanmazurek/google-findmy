package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lnu extends Exception {
    private final int a = 1;

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        if (this.a != 1) {
            str = "Unknown error";
        } else {
            str = "Package not available";
        }
        return a.ag(str, "LoaderException{", "}");
    }
}
