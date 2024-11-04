package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fzj {
    private final int a;

    public fzj(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fzj) || this.a != ((fzj) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.a});
    }

    public final String toString() {
        return "java_hash=" + this.a;
    }

    public void a() {
    }
}
