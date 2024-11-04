package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jtt extends jtu {
    public final String toString() {
        jeq jeqVar = new jeq("exponentialBackoff");
        jeqVar.e("firstDelayMs", 100L);
        jeqVar.c("multiplier", 2.0d);
        jeqVar.d("tries", this.a);
        return jeqVar.toString();
    }
}
