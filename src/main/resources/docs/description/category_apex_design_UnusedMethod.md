Since: PMD 7.0.0

Avoid having unused methods since they make understanding and maintaining code harder.

This rule finds not only unused private methods, but public methods as well.

[ApexLink](https://github.com/nawforce/ApexLink) is used to make this possible and this needs
additional configuration. The environment variable `PMD_APEX_ROOT_DIRECTORY` needs to be set prior to executing
PMD. With this variable the root directory of the Salesforce metadata, where `sfdx-project.json` resides, is
specified. ApexLink can then load all the classes in the project and figure out, whether a method is used or not.

For an accurate analysis it is important that the `PMD_APEX_ROOT_DIRECTORY` contains a complete set of metadata that
may be referenced from the Apex source code, such as Custom Objects, Visualforce Pages, Flows and Labels. The
`PMD_APEX_ROOT_DIRECTORY` directory must contain a `sfdx-project.json`, but metadata may be either in the
[SFDX Source format](https://developer.salesforce.com/docs/atlas.en-us.sfdx_dev.meta/sfdx_dev/sfdx_dev_source_file_format.htm)
or the older MDAPI format. The `packageDirectories` entries in `sfdx-project.json` are used to determine which
directories to search for metadata, if a `.forceignore` file is present it will be respected.

If the Apex code references external packages via namespace(s) you should declare these in your `sfdx-project.json`
file using the 'plugins' syntax shown in the example below to avoid errors. Here's an example of a
well-formed `sfdx-project.json`:
```json
{
    &quot;packageDirectories&quot;: [
      {
        &quot;path&quot;: &quot;src&quot;,
        &quot;default&quot;: true
      }
    ],
    &quot;namespace&quot;: &quot;my_namespace&quot;,
    &quot;sfdcLoginUrl&quot;: &quot;https://login.salesforce.com&quot;,
    &quot;sourceApiVersion&quot;: &quot;52.0&quot;,
    &quot;plugins&quot;: {
        &quot;dependencies&quot;: [
            {&quot;namespace&quot;: &quot;aa&quot;}
        ]
    }
}
```

Example(s):
```
public class Triangle {
    private Double side1;
    private Double side2;
    private Double side3;

    public Triangle(Double side1, Double side2, Double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Method is not invoked so can be removed
    public Double area() {
        return (side1 + side2 + side3)/2;
    }
}
```
