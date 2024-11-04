package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum dxp {
    DEVICES("Devices screen"),
    HELP("Help screen"),
    LICENSES("Licenses screen"),
    LOCK("Lock dialog"),
    SET_PASSWORD("Set password screen"),
    RENAME("Rename dialog"),
    RING_CONFIRMATION("Ring confirmation dialog"),
    SETUP_CONFIRMATION("Setup confirmation dialog"),
    WIPE_CONFIRMATION("Wipe confirmation dialog"),
    WELCOME("Welcome screen"),
    AUTH("Authorize account screen");

    public final String l;

    dxp(String str) {
        hwx.K(!TextUtils.isEmpty(str), "loggedName cannot be empty");
        this.l = str;
    }
}
