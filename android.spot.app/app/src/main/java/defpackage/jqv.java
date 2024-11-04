package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jqv {
    public final int a;
    public final jos b;

    /* JADX INFO: Access modifiers changed from: protected */
    public jqv(jos josVar, int i) {
        if (josVar != null) {
            if (i >= 0) {
                this.a = i;
                this.b = josVar;
                return;
            }
            throw new IllegalArgumentException(a.ae(i, "invalid index: "));
        }
        throw new IllegalArgumentException("format options cannot be null");
    }

    public abstract void a(jqz jqzVar, Object obj);
}
