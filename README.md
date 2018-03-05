# Android Modular Architecture Example
Example architecture for a scalable modular Android application with gradle modules and dagger 2.

This example project gices you a rough idea how can build a scalable Android application and is an attempt to solve so following situation.

The given scenario: You are developing with many other developers on one Android app.

Question:
- Speed?
- Team Size?
- Scalable?
- Merge conflicts?
- Separation?
- Testing?
- Buildtime?

Answer: Modularization! It is possible to split your app into several gradle modules. Each module can have their own responsibility and can be developed nearly independently.

# Modules
This project is developed with the following approach.

![Overview modules][1]

We have four main modules: app, core, features and shared.
- app-module is the starting point and creates the dagger graph. It also provides the communication between the features, because this module knows all of them.
- features-module contains several sub modules with each feature. Each feature is developed with MVP and talks with interactors.
- core-module has also several submodules, which are providing data to the features. Interactors, services, etc. are located here.
- shared-module provides submodules with libraries, interfaces, services etc. which are used by every other module.

# Submodules
![Overview submodules][2]

[1]: docs/images/overview-modules.png
[2]: docs/images/overview-submodules.png