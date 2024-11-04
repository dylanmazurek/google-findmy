package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum jot {
    GENERAL(true),
    BOOLEAN(false),
    CHARACTER(false),
    INTEGRAL(false),
    FLOAT(true);

    public final boolean f;

    jot(boolean z) {
        this.f = z;
    }
}
