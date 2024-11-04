package defpackage;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flz {
    private static String a;
    private static int b;

    public static String a() {
        BufferedReader bufferedReader;
        String am;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        String processName;
        if (a == null) {
            if (Build.VERSION.SDK_INT < 28) {
                int i = b;
                if (i == 0) {
                    i = Process.myPid();
                    b = i;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i > 0) {
                    try {
                        am = a.am(i, "/proc/", "/cmdline");
                        allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    } catch (IOException unused) {
                        bufferedReader = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        bufferedReader = new BufferedReader(new FileReader(am));
                        try {
                            String readLine = bufferedReader.readLine();
                            fma.aR(readLine);
                            str = readLine.trim();
                        } catch (IOException unused2) {
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader2 = bufferedReader;
                            fly.a(bufferedReader2);
                            throw th;
                        }
                        fly.a(bufferedReader);
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                }
                a = str;
            } else {
                processName = Application.getProcessName();
                a = processName;
            }
        }
        return a;
    }
}
