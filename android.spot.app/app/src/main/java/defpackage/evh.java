package defpackage;

import android.os.Bundle;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evh {
    public final Bundle a;
    public final evj b;
    public final Consumer c;
    public boolean d;
    public iwk e;

    public evh(int i) {
        this(i, evj.a().e());
    }

    public final void a() {
        this.d = true;
        iwk iwkVar = this.e;
        if (iwkVar == null) {
            return;
        }
        iwkVar.e();
        this.e = null;
    }

    public evh(int i, Bundle bundle, evj evjVar, Consumer consumer) {
        this.d = false;
        this.e = null;
        this.b = evjVar;
        this.c = consumer;
        Bundle bundle2 = new Bundle();
        this.a = bundle2;
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putInt("message_resource_id", i);
        hwx.J(bundle2.containsKey("message_resource_id"));
    }

    public evh(int i, evj evjVar) {
        this(i, null, evjVar, null);
    }
}
