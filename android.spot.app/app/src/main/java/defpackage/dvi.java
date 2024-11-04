package defpackage;

import j$.time.Duration;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvi extends cgk {
    public static final jnk a = jnk.l("com/google/android/apps/adm/activities/SettingsLoaderViewModel");
    public static final Duration b = Duration.ofSeconds(2);
    public final ScheduledExecutorService c;
    public final cfn d = new cfn(false);
    public volatile jer e = jdl.a;
    public final ksr f;
    public final bym g;
    public final elo h;
    public final elo i;

    public dvi(elo eloVar, elo eloVar2, ksr ksrVar, bym bymVar, ScheduledExecutorService scheduledExecutorService) {
        this.h = eloVar;
        this.i = eloVar2;
        this.f = ksrVar;
        this.g = bymVar;
        this.c = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, jyz] */
    @Override // defpackage.cgk
    public final void c() {
        if (this.e.g()) {
            this.e.c().cancel(false);
            this.e = jdl.a;
        }
    }
}
