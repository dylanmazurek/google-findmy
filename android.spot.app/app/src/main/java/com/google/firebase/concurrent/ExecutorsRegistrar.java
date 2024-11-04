package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.kno;
import defpackage.knp;
import defpackage.knq;
import defpackage.knr;
import defpackage.knt;
import defpackage.knu;
import defpackage.koh;
import defpackage.kok;
import defpackage.kon;
import defpackage.kou;
import defpackage.kox;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final koh a = new koh(new kok(2));
    public static final koh b = new koh(new kok(3));
    public static final koh c = new koh(new kok(4));
    static final koh d = new koh(new kok(5));

    public static ScheduledExecutorService a(ExecutorService executorService) {
        return new kou(executorService, (ScheduledExecutorService) d.a());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        knt kntVar = new knt(new kon(kno.class, ScheduledExecutorService.class), new kon(kno.class, ExecutorService.class), new kon(kno.class, Executor.class));
        kntVar.c = new kox(1);
        knt kntVar2 = new knt(new kon(knp.class, ScheduledExecutorService.class), new kon(knp.class, ExecutorService.class), new kon(knp.class, Executor.class));
        kntVar2.c = new kox(0);
        knt kntVar3 = new knt(new kon(knq.class, ScheduledExecutorService.class), new kon(knq.class, ExecutorService.class), new kon(knq.class, Executor.class));
        kntVar3.c = new kox(2);
        knt a2 = knu.a(new kon(knr.class, Executor.class));
        a2.c = new kox(3);
        return Arrays.asList(kntVar.a(), kntVar2.a(), kntVar3.a(), a2.a());
    }
}
