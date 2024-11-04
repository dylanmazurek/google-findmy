package defpackage;

import android.graphics.drawable.Animatable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ec extends eh {
    private final Animatable a;

    public ec(Animatable animatable) {
        this.a = animatable;
    }

    @Override // defpackage.eh
    public final void a() {
        this.a.start();
    }

    @Override // defpackage.eh
    public final void b() {
        this.a.stop();
    }
}
