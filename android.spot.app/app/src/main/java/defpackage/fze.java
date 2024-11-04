package defpackage;

import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fze {
    public final Object a;

    public fze(Object obj) {
        this.a = obj;
    }

    public final ScanRecord a() {
        return ((ScanResult) this.a).getScanRecord();
    }

    public final fyy b() {
        return new fyy(((ScanResult) this.a).getDevice());
    }
}
