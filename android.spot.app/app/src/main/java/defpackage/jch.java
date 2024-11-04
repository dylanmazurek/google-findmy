package defpackage;

import com.google.ar.core.ArCoreApk;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jch implements ArCoreApk.ICheckAvailabilityCallback {
    final /* synthetic */ Consumer a;
    final /* synthetic */ jci b;

    public jch(jci jciVar, Consumer consumer) {
        this.a = consumer;
        this.b = jciVar;
    }

    @Override // com.google.ar.core.ArCoreApk.ICheckAvailabilityCallback
    public final void onResult(final ArCoreApk.Availability availability) {
        final Consumer consumer = this.a;
        this.b.b.post(new Runnable() { // from class: com.google.ar.core.ArCoreApkImpl$3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Consumer.this.accept(availability);
            }
        });
    }
}
