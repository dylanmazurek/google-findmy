package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class us {
    private final uv a;
    private final int b;

    public us(uv uvVar, int i) {
        this.a = uvVar;
        this.b = i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AnimationResult(endReason=");
        if (this.b != 1) {
            str = "Finished";
        } else {
            str = "BoundReached";
        }
        sb.append((Object) str);
        sb.append(", endState=");
        sb.append(this.a);
        sb.append(')');
        return sb.toString();
    }
}
