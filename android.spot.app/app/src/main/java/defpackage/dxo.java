package defpackage;

import android.text.TextUtils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dxo {
    public static final dxo a;
    private static final /* synthetic */ dxo[] d;
    public final String b;
    public final String c;

    static {
        dxo dxoVar = new dxo();
        a = dxoVar;
        d = new dxo[]{dxoVar};
    }

    private dxo() {
        hwx.K(!TextUtils.isEmpty("Network"), "action cannot be empty");
        this.b = "Network";
        hwx.K(!TextUtils.isEmpty("Devices received"), "label cannot be empty");
        this.c = "Devices received";
    }

    public static dxo[] values() {
        return (dxo[]) d.clone();
    }
}
