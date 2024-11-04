package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mpw extends mqb {
    public abstract Random a();

    @Override // defpackage.mqb
    public final int b() {
        return a().nextInt(2147418112);
    }
}
