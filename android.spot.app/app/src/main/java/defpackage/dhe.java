package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dhe implements Cloneable {
    public final bqd a = dsz.a;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dhe clone() {
        try {
            return (dhe) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof dhe) {
            return amr.i(this.a, ((dhe) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
