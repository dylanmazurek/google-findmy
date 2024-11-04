package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum ddf {
    JSON(".json"),
    ZIP(".zip");

    public final String c;

    ddf(String str) {
        this.c = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.c;
    }
}
